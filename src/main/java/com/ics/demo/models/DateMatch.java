package com.ics.demo.models;

public class DateMatch {

    private long BlinDateId;


    private String score;
    private String attachment;

    private DateMatch(){
    }

    public DateMatch(long BlindateId, String score, String attachment) {
        this.BlinDateId = BlindateId;
        this.score = score;
        this.attachment = attachment;
    }

    public long getId() {
        return BlinDateId;
    }
    public void setId(long id) {
        this.BlinDateId = id;
    }

    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }

    public String getAttachment() {
        return attachment;
    }
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "DateMatch{" +
                "BlinDateId=" + BlinDateId +
                ", score='" + score + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }
}
