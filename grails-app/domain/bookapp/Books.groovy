package bookapp

class Books {
    String name
    String isbn
    Float price


    static constraints = {
        name blank: false
        isbn blank:false
        price nullable:true
    }
}
