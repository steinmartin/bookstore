package bookapp

class WhiteboardController {
    def calculationsService

    def index() { }

    def variables(){
        def myTotal=1
        render("Total " + myTotal)
        render("</br> ")

        def firstName="Mike"
        render("</br> "+ firstName)

        def today=new Date ("2/1/2017")
        render("</br> today is" + today)
    }

    def strings(){

        def first="Mike"
        def last="Kelly"
        def points=4
        def fullName= "Yvan Loic"
        render "Your fullName $first has ${fullName.length()} characters"
        render("</br>")

    }
    def conditions(){
       def welcomeMessage=calculationsService.welcome(params)
        render welcomeMessage
    }
}
