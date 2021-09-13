package org.zerock.store;

import java.util.Scanner;

public class StoreUI {

    //여러 메서드들이 공유, 상태(돼지저금통)
     private Scanner scanner;
     //협력자 - 의존성
    private StoreService storeService;

    public StoreUI(Scanner scanner, StoreService storeService) {
        this.scanner = scanner;
        this.storeService = storeService;
    }

/*
     public StoreUI(){
         this.scanner = new Scanner(System.in);
     }
*/
     /* this 호출 에시
     public void greeting(){
        System.out.println("Hello World");
        } 인스턴스 내에 메소드 호출할 때 this 활용 가능
      */

    public void fnMenu(){
        System.out.println("원하시는 메뉴가 뭔가요?");
        //메서드내에서 선언하면, 매번 메서드를 선언해야 사용가능
        //scanner = new Scanner(system.in);메서드에서만 사용 할 떄 쓰는방법임
        /*this 호출 예시 2
         같은 인스턴스 내에 있는 메소드(변수)호출 방법 = this!
        this.greeting(); <- 위에 주석에 있는 메소드를 활용한다면
         */

        String menuStr = this.scanner.nextLine();
        //this가 원래 이렇게 들어가있는 형태다
        //같은 인스턴스에 있는 scanner를 사용하는거니깐!
        System.out.println(menuStr);

        StoreDTO storeDTO = this.storeService.findByMenuName(menuStr);

        System.out.println(storeDTO);


    }


}
