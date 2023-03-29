package ex19.ex19_1;

public class Computer2 {
    private String model;
    private int pricе;
    private int memory;
    private int videoCard;
    Computer Asus = new Computer("Asus", 7500, 800, 200);

    public Computer2() {
        this.model = model;
        this.pricе = pricе;
        this.memory = memory;
        this.videoCard = videoCard;
    }

    public void getInfo() {
        System.out.println(getModel());
        System.out.println(getPricе());
        System.out.println(getMemory());
        System.out.println(getVideoCard());

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPricе() {
        return pricе;
    }

    public void setPricе(int pricе) {
        this.pricе = pricе;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }
}
