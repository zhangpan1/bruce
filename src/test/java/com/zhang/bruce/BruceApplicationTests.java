package com.zhang.bruce;

import com.zhang.bruce.util.DoorGodAESUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BruceApplicationTests {

    @Test
    void contextLoads() {
        DoorGodAESUtils.encode("B5puLVPem78VvW0GNeoA2w==","WIND_GOD_ENCRY_KEY");
    }

}
