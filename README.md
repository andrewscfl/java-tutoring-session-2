OUTPUT (And explaination)

--- BEGIN OUTPUT ---

car type specific methods: 

schoolBus Opening side door...

schoolBus Opening stop sign...


----------------------------

Car Name: toyota

toyota Started Driving...

toyota Started Breaking...

toyota Filling up the gas Tank...


----------------------------


Car Name: schoolBus

schoolBus Started Driving...

schoolBus Started Breaking...

schoolBus Filling up the gas Tank...


----------------------------


Car Name: Tesla Model X

Tesla Model X Began self driving...

Tesla Model X Started Breaking...

Tesla Model X Plugged into charging station...


----------------------------


Car Name: ford f150

ford f150 Started Driving...

ford f150 Started Breaking...

ford f150 Filling up the gas Tank...


----------------------------


Car Name: Tesla Model Y

Tesla Model Y Began self driving...

Tesla Model Y Started Breaking...

Tesla Model Y Plugged into charging station...





--- END OUTPUT ---

OUTPUT EXPLAINED:

notice how Bus's Tesla's and standard cars are all "Cars" and all do things such as Drive, Break, and Refuel, Because of this all of these sub-types of cars take these properties from the car object. As you can see in the case of BUS, a bus drives, breaks, and refuels like a regular car so it inherits all those properties and adds a few more in such as OpenSideDoor() and OpenStopSign(), In the case of a tesla however, it also drives, breaks, and refuels, however this is done in a different way than a normal car. A tesla can self drive and a tesla recharges with electricity instead of refueling with gasoline. Because of this we use POLYMORPHISM or the concept of multiple forms to implement the refueling and the driving methods differently from a regular car while retaining the other properties.
