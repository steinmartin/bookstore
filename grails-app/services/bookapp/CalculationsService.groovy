package bookapp

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

    def welcome(params) {
        def firstName=params.first
        def totalPoints=params.points.toInteger()



    }
    def processCheckin(lookupinstance){
        def welcomeMessage= ""
        //Lookup customer by Id
        def customerInstance= Customer.findByPhone(lookupinstance.phone)
        //Set a new Customer
        if(customerInstance==null){
            customerInstance=lookupinstance
            customerInstance.firstName="Customer"
        }
        def totalawards=0
        customerInstance.awards.each{
            totalawards=totalawards+it.points

        }
        customerInstance.totalPoint=totalawards
        //calculate Total point
        // Create a welcome message
        switch (totalawards) {
            case 5: //calculate Total point
                // Create a welcome message
                // Add bookapp record
                // Save Customer
                welcomeMessage = "Welcome back $firstName, this is on us"
                break;
            case 4:
                welcomeMessage = "Welcome back $firstName, you have $totalawards you have free drink"
                break
            case 2..3:
                welcomeMessage ="Welcome back $firstName, you have $totalawards you have free drink"
                break
            default:
                welcomeMessage ="Welcome back $firstName, thanks for registrierung"
        }

        // Add bookapp record
        if(totalawards<5){
                customerInstance.addToawards(new Award(awardDate: new Date(),type: "Purchase",points: 1))
        }else{
            customerInstance.addToawards(new Award(awardDate: new Date(),type: "Reward",points: -5))
        }
        // Save Customer
        customerInstance.save()


        return [customerInstance,welcomeMessage] //send message to the Controller use [] and receive u shold ()
    }
}
