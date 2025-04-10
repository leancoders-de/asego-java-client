package de.leancoders.asego.client.helper;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import de.leancoders.asego.common.model.category.Category;
import lombok.NonNull;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import static com.google.common.base.MoreObjects.firstNonNull;

public class CategoryHelper {

    public static Map<String, List<Map<String, Long>>> map(@NonNull final Iterable<Category> categories) {
        final ImmutableList.Builder<Map<String, Long>> positionCategoryIdBuilder = ImmutableList.builder();

        final AtomicLong atomicLong = new AtomicLong(0);
        for (final Category category : categories) {
            final Long categoryId = category.getId();

            positionCategoryIdBuilder.add(
                ImmutableMap.of(
                    "position", atomicLong.getAndIncrement(),
                    "category_id", categoryId
                )
            );
        }

        final ImmutableList<Map<String, Long>> positionCategoryList = positionCategoryIdBuilder.build();

        return ImmutableMap.of(
            "category_links",
            positionCategoryList
        );
    }

    @Nonnull
    public static Map<String, Category> categoriesByName(@NonNull final Category category) {
        return categoriesByName(category, true);
    }

    @Nonnull
    public static Map<String, Category> categoriesByName(@NonNull final Category category, final boolean cascade) {
        final Map<String, Category> map = Maps.newHashMap();

        final String name = category.getName();
        map.put(name, category);

        if (cascade) {
            final List<Category> children = firstNonNull(category.getChildrenData(), ImmutableList.of());
            for (final Category child : children) {
                map.putAll(
                    categoriesByName(child, cascade)
                );
            }
        }

        return ImmutableMap.copyOf(map);
    }

    @Nonnull
    public static Map<Long, Category> categoriesById(@NonNull final Category category) {
        return categoriesById(category, true);
    }

    @Nonnull
    public static Map<Long, Category> categoriesById(@NonNull final Category category, final boolean cascade) {
        final Map<Long, Category> map = Maps.newHashMap();

        final Long id = category.getId();
        map.put(id, category);

        if (cascade) {
            final List<Category> children = firstNonNull(category.getChildrenData(), ImmutableList.of());
            for (final Category child : children) {
                map.putAll(
                    categoriesById(child, cascade)
                );
            }
        }

        return ImmutableMap.copyOf(map);
    }

    @Nonnull
    public static Iterable<Category> categories(@NonNull final Category category) {
        final ImmutableList.Builder<Category> list = ImmutableList.builder();

        list.add(category);

        final List<Category> children = firstNonNull(category.getChildrenData(), ImmutableList.of());
        for (final Category child : children) {
            list.addAll(
                categories(child)
            );
        }

        return list.build();
    }
}
