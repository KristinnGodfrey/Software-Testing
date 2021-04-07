from theatre import seatFinder

class SeatFinderTest(unittest.TestCase):
    def test_prefer_near_front(self):
        finder = seatFinder(available_seats={"A6", "B6", "C7"})
        seats = finder.find_seats(1)
        assert seats == {"A6"}
    
    def test_find_adjacent_seats_when_more_than_one_requested(self):
        finder = seatFinder(available_seats={"A6", "A8", "C6", "C7"})
        seats = finder.find_seats(2)
        assert seats == {"C6", "C7"}

    def test_find_seperate_seats_when_adjacent_not_available(self):
        finder = seatFinder(available_seats={"A6", "B6", "C7"})
        seats = finder.find_seats(2)
        assert seats == {"B6", "A6"}
    
    def test_find_seats_fails_when_not_enough_available(self): 
        finder = seatFinder(available_seats={"A6", "B6", "C7"})
        seats = finder.find_seats(5)
        assert seats == {}

    def test_find_seats_for_wheelchair_users(self):
        finder = seatFinder(available_seats={"A1W", "A6", "B6", "C7" })
        seats = finder.find_seats(1, wheelchair_count = 1)
        assert seats == {"A1W"}