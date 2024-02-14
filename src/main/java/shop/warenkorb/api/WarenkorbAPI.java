package shop.warenkorb.api;

import org.springframework.web.bind.annotation.*;
import shop.warenkorb.model.*;
import shop.warenkorb.service.*;

@RestController
public class WarenkorbAPI {

    WarenkorbService ws;

    public WarenkorbAPI(WarenkorbService ws) {
        this.ws = ws;
    }

    @PostMapping("/checkout")
    public void checkout(@RequestBody Warenkorb w) {
        ws.checkout(w);
    }

}
