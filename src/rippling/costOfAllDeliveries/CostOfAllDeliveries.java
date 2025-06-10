package rippling.costOfAllDeliveries;

/*
* Question:
* Given a list of some drivers and the deliveries they are making, need to write a code to compute the total cost of all deliveries. It needed to have 3 methods
1. add driver(driverId)
2. add deliveries(startTime, endTime)
3. getTotalCost() getTotalCost was needed in optimised time, which I provided by computing cost at the time of adding the delivery - interviewer had agreed to this approach.
I explained the approach and solved by defining 3 classes Driver, Delivery and the main service. The panelist tested it against his test cases and got the expected results.
I had asked for the evaluation criteria to which the interviewer had said let's solve the question as much as possible
Part 2 Add two more functionalities
1. payUpToTime(upToTime) -> settle the delivery cost up to this time
2. getCostToBePaid() -> get the remaining delivery costs left after settling the payment Discussed the approach for this in O(n), he wanted more optimal solution. Discussed approach for production env based on events to trigger completion and keeping a track of completed deliveries. Then to be paid is as simple as paid minus total cost (from part 1) Agreed on the approach, wrote the code, tested it against interviewer's test cases - worked as expected
Part 3 Implement a method to provide simultaneous deliveries across drivers. He was only expecting the approach. Discussed by sorting and then checking the overlaps. Seemed satisfied and we closed the discussion.
*/
public class CostOfAllDeliveries {
}
