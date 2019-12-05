package ChainOfResposibility;

class Konfiguracja {
    static void addNextLink(ChainLink link, ChainLink nextLink){
        link.setNextHandler(nextLink);
    }
}
