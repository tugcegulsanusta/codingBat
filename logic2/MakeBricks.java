package logic2;

public class MakeBricks {
    /*
    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks


    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
     */
    public boolean makeBricks(int small, int big, int goal) {
        int div = goal/5;
        int mod = goal%5;
        int need = goal-big*5;
        if(small>=goal){
            return true;
        }else if(div<=big && mod<=small){
            return true;
        }else if(need>=0 && small>=need){
            return true;
        }return false;

    }

}
