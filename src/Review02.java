
public class Review02 {

    public static void main(String[] args) {
        //1から100までを整数で表示する処理
        for(int i = 1 ; i<=100;i++) {
            //3と5で除せるものをFizzBuzzと表示する。
            if(i % (3 * 5) == 0) {  //3と5の最小公倍数は15なので、15で除する。
                System.out.println("FizzBuzz");
                //3で除せるものをFizzと表示する。
            }else if (i % 3== 0) {
                System.out.println("Fizz");
                //5で除せるものをBuzzと表示する。
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
                //それ以外の数をそのまま表示する。
            }else {
                System.out.println(i);
            }
        }
    }

}


