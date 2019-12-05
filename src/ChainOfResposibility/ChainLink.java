package ChainOfResposibility;

interface ChainLink {
    void HandleHelp(Request request);
    void ShowHelp();
    void setNextHandler(ChainLink nextLink);
}
