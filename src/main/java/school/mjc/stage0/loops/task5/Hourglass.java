package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
            for(int i=1;i<=height/2;i++){
                for(int j=1;j<=height;j++){
                    if(i==1){
                        System.out.print("8");
                        continue;
                    }
                    if(i<=height/2){
                        if(j>=i&&j<=(height-i+1)){
                            System.out.print("8");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }

            for(int i=height;i>=(height/2)+1;i--){
                for(int j=1;j<=height;j++){
                    if(i==(height/2)+1){
                        System.out.print("8");
                        continue;
                    }
                    if(j>=i-(height/2)&&j<=height-i+(height/2)+1){
                        System.out.print("8");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}
