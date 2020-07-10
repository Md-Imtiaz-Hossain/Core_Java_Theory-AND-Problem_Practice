package Inhar_it;

public class UIControl {
    private boolean isEnable = true;

    public UIControl(boolean isenable) {
        this.isEnable=isenable;
        System.out.println("UI Control");
    }

    public void enable(){
        isEnable = true;
    }

    public void disable(){
        isEnable = false;
    }

    public boolean isEnable() {
        return isEnable;
    }
}
