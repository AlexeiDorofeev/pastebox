package doro.pastebox.service;

import doro.pastebox.api.request.PasteBoxRequest;
import doro.pastebox.api.response.PasteBoxResponse;
import doro.pastebox.api.response.PasteBoxUrlResponse;
import doro.pastebox.repository.PasteBoxRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PasteBoxServiceImpl implements PasteBoxService {

    private final PasteBoxRepository repository;

    @Override
    public PasteBoxResponse getByHash(String hash) {
        return null;
    }

    @Override
    public List<PasteBoxResponse> getFirstPublicPasteBoxes(int amount) {
        return null;
    }

    @Override
    public PasteBoxUrlResponse create(PasteBoxRequest pasteBoxRequest) {
        return null;
    }
}
