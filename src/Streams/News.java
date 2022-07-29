package Streams;

public class News {
    //class News { int newsId; String postedByUser; String commentByUser; String commen

    private int newsid;
    private String postedByuser;
    private String commentByUser;
    private String comment;

    @Override
    public String toString() {
        return "News{" +
                "newsid=" + newsid +
                ", postedByuser='" + postedByuser + '\'' +
                ", commentByUser='" + commentByUser + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public News(int newsid, String postedByuser, String commentByUser, String comment) {
        this.newsid = newsid;
        this.postedByuser = postedByuser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getPostedByuser() {
        return postedByuser;
    }

    public void setPostedByuser(String postedByuser) {
        this.postedByuser = postedByuser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
