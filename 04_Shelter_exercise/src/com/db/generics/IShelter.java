package com.db.generics;

public interface IShelter {
    public String getName();
    public float getLatitude();
    float getLongitude();
    String getOwner();
    void receiveDonation(double amount);
    void spend(double amount, String motivation) throws NegativeSumException;
}
