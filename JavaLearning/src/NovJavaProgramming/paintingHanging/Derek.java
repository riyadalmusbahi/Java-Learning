package NovJavaProgramming.paintingHanging;

public class Derek {

    private Tool tool= new Tool(" ");

    public void setTool(Tool tool) {
        this.tool = tool;
    }
    public void hangPainting(){
        if (canHangPainting()){
            System.out.println("Derek can hang the painting now");
        }
        else {
            System.out.println("Derek can't hang the painting, the hammer is missing");
        }
    }

    public Boolean canHangPainting(){
       // return  tool != null && tool.getName() == "Hammer";
        return tool.getName() == "Hammer";
    }

}
