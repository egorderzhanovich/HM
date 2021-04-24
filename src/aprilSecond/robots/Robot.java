package HM.aprilSecond.robots;

import HM.aprilSecond.hands.IHand;
import HM.aprilSecond.heads.IHead;
import HM.aprilSecond.legs.ILeg;

import java.util.Objects;

public class Robot implements IRobot{
    private IHead head;
    private ILeg leg;
    private IHand hand;

    public Robot(IHead head, ILeg leg, IHand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }



    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }

    public static Robot findMostExpensive(Robot  ...robots){
        Robot robot = robots[0];
        for (int i = 1; i < robots.length; i++) {
            if(robots[i].getPrice() > robot.getPrice()){
                robot = robots[i];
            }
        }
        return robot;
    }

}
