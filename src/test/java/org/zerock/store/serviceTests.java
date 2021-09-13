package org.zerock.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class serviceTests {

    private StoreService service;

    @Test
    public void test1(){

        service = new StoreService();

        StoreDTO storeDTO = service.findByMenuName("냉면");

        System.out.println(storeDTO);


    }

}
