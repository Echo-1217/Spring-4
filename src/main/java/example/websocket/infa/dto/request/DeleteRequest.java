package example.websocket.infa.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class DeleteRequest {
    @NotBlank(message = "id is needed")
    private String id;
}
