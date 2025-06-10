package rippling.expenseRuleEvaluator;

/*
* Question:
* We have a list of expense and rules. Aim is to validate rules for each expense.
Each expense is similar to
{
	expenseid: "1"
	itemId: "Item1"
	expensetype: "Food"
	amountInUsd : "250"
	sellerType : "restaurant"
	SellerName "ABC restaurant"

}
* List of rules similar to
- Total expense should not be > 175
- Seller type restaurant should not have expense more than 45
- Entertainment expense type should not be charged
* Run the rules on expense and flag the rule which do not satisfy.
* Implement evaluateRule(List<rule> , List<expense>)
* */
class Item {
    int itemId;
    String itemName;
    String itemDetails;

}

public class ExpenseRuleEvaluation {

}
