package de.leancoders.asego.common.response.doctor;

import de.leancoders.asego.common.response.ListResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DoctorSearchResponse extends ListResponse<DoctorListItem> {
}
