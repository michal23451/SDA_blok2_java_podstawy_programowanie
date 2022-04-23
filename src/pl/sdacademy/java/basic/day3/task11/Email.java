package pl.sdacademy.java.basic.day3.task11;

public class Email {
    // mozemy dac final
    private  String receiver;
    private  String title;
    private  String bodyMsg;
    private  String attachment;

    @Override
    public String toString() {
        return "Email{" +
                "receiver='" + receiver + '\'' +
                ", title='" + title + '\'' +
                ", bodyMsg='" + bodyMsg + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    public Email(Builder b) {
        this.receiver = b.receiver;
        this.title = b.title;
        this.bodyMsg = b.bodyMsg;
        this.attachment = b.attachment;
    }



    public static class Builder {
        private String receiver;
        private String title;
        private String bodyMsg;
        private String attachment;

        public Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder bodyMsg(String bodyMsg) {
            this.bodyMsg = bodyMsg;
            return this;
        }

        public Builder attachment(String attachment) {
            this.attachment = attachment;
            return this;
        }

        public Email build() {
            return new Email(this);
        }

    }


    //niestatycznie - moje testy
    public Email(NotStaticBuilder b) {
        this.receiver = b.receiver;
        this.title = b.title;
        this.bodyMsg = b.bodyMsg;
        this.attachment = b.attachment;
    }

    public Email () {

    }



    public class NotStaticBuilder {
        private String receiver;
        private String title;
        private String bodyMsg;
        private String attachment;

        public NotStaticBuilder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        public NotStaticBuilder title(String title) {
            this.title = title;
            return this;
        }

        public NotStaticBuilder bodyMsg(String bodyMsg) {
            this.bodyMsg = bodyMsg;
            return this;
        }

        public NotStaticBuilder attachment(String attachment) {
            this.attachment = attachment;
            return this;
        }

        public Email build() {
            return new Email(this);
        }

    }

}
