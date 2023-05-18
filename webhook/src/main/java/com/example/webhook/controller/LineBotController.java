import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LineBotController {

    @PostMapping("/line/webhook")
    public void webhook(@RequestBody Map<String, Object> payload) {
        // payloadはJSON形式のデータをMapとして受け取ります。
        System.out.println(payload);
    }
}
