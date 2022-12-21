package doro.pastebox.api.response;

import doro.pastebox.api.request.PublicStatus;
import lombok.Data;

@Data
public class PasteBoxResponse {
    private String data;
    private PublicStatus status;
}
