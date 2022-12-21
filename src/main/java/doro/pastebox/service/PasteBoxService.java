package doro.pastebox.service;

import doro.pastebox.api.request.PasteBoxRequest;
import doro.pastebox.api.response.PasteBoxResponse;
import doro.pastebox.api.response.PasteBoxUrlResponse;

import java.util.List;

public interface PasteBoxService {
    PasteBoxResponse getByHash(String hash);

    List<PasteBoxResponse> getFirstPublicPasteBoxes(int amount);

    PasteBoxUrlResponse create(PasteBoxRequest pasteBoxRequest);
}
