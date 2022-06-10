package chapter4;

public class TabularOutPut {
    public static void main(String[] args) {

        for(int i = 1; i <=10; i++){
            for(int j = i*10;j <=i*10; j+=10){
                for(int k =i*20; k <= i*20;k+=20){
                    for(int l = i*30; l <=i*30; l+=30){
                        for(int m = j;m<=j;m +=j){
                            System.out.printf("%d%10d%12d%10d%10d%n", i,j,k,l,m);
                        }
                    }

                }
            }
        }
    }
}
