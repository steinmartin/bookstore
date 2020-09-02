package bookapp



class Author {
    String name

    static hasMany=[books: Books]

    static mapping ={
        books cascade: 'all-delete-orphan'
    }

    static constraints = {
         books nullable:false
    }
}
