package bookapp

class OnlineOrder {
    Date orderDate
    Integer orderNumber
    Float orderTotal
    static belonsTo =[customer:Customer]
    static hasMany =[orderItems:Orderitem]


    static constraints = {
    }
}
