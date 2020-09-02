package bookapp

class Customer {
     String firstName
    String lastName
    Long phone
    String email
    Integer totalPoint
    static hasMany=[awards:Award,orders:OnlineOrder]

    static constraints = {


        firstName blank: false
        lastName  blank: false
        email nullable: true
        totalPoint nullable:true
    }
}
