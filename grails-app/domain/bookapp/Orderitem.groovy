package bookapp

class Orderitem {
    Integer qty
    Float total
    static belongsTo=[orders:OnlineOrder, product:Books]


    static constraints = {


    }
}
