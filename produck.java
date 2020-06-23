package com.SE.java;

public class produck {
    private int id;
    //分类 用id表示
    private int category_id;
    private String name;
    //副标题
    private String subtile;
    //产品主图地址
    private String main_image;
    //产品图片地址
    private  String sub_images;
    //商品详情
    private String detal;
    //价格
    private  int price;
    //库存数量
    private int stock;
    //s商品状态 1.在售 2.下架3.删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtile() {
        return subtile;
    }

    public void setSubtile(String subtile) {
        this.subtile = subtile;
    }

    public String getMain_image() {
        return main_image;
    }

    public void setMain_image(String main_image) {
        this.main_image = main_image;
    }

    public String getSub_images() {
        return sub_images;
    }

    public void setSub_images(String sub_images) {
        this.sub_images = sub_images;
    }

    public String getDetal() {
        return detal;
    }

    public void setDetal(String detal) {
        this.detal = detal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public produck() {
    }

    public produck(int id, int category_id, String name, String subtile, String main_image, String sub_images, String detal, int price, int stock) {
        this.id = id;
        this.category_id = category_id;
        this.name = name;
        this.subtile = subtile;
        this.main_image = main_image;
        this.sub_images = sub_images;
        this.detal = detal;
        this.price = price;
        this.stock = stock;
    }
}
