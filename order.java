package com.SE.java;

import java.util.Date;

public class order {
    private int id;
    private int order_id;
    private int user_id;
    //实际付款金额,单位是元,保留两位小数
    private int payment;
    //支付类型
    private String payment_type;
    //运费
    private int postage;
    //订单状态:0-已取消-1-未付款，2-已付款，3-已发货，4-交易成功，5-交易关闭
    private int status;
    //支付时间
    private Date payment_time;
    //发货时间
    private Date send_time;
    //交易完成时间
    private Date end_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public int getPostage() {
        return postage;
    }

    public void setPostage(int postage) {
        this.postage = postage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(Date payment_time) {
        this.payment_time = payment_time;
    }

    public Date getSend_time() {
        return send_time;
    }

    public void setSend_time(Date send_time) {
        this.send_time = send_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public order() {
    }

    public order(int id, int order_id, int user_id, int payment, String payment_type, int postage, int status, Date payment_time, Date send_time, Date end_time) {
        this.id = id;
        this.order_id = order_id;
        this.user_id = user_id;
        this.payment = payment;
        this.payment_type = payment_type;
        this.postage = postage;
        this.status = status;
        this.payment_time = payment_time;
        this.send_time = send_time;
        this.end_time = end_time;
    }
}
