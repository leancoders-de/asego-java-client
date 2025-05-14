package de.leancoders.asego.common.response.insurance;

import de.leancoders.asego.common.response.ListResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data

@EqualsAndHashCode(callSuper = true)
public class InsuranceSearchResponse extends ListResponse<InsuranceListItem> {
}
