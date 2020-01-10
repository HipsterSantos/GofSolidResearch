package exe.roadmap.module.innerclass;

public class Button {
    private String title;
    private OnclickListener onclickListener;

    public String getTitle() {
        return title;
    }
    public void setOnclickListener(OnclickListener clickListener){
        this.onclickListener = clickListener;
    }

    public void onClick(){
        this.onclickListener.onClick(this.title);
    }
    public interface OnclickListener{
        void onClick(String title);
    }

    public class test{

    }

    public enum st{}

}
