from pytest_projects.main.phonebook import PhoneBook
import pytest

@pytest.fixture
def phonebook(tmpdir):
    return PhoneBook(tmpdir)    

def test_lookup_by_name(phonebook):
    phonebook.add("Bob", "1234")
    assert "1234" == phonebook.lookup("Bob")    

def test_phonebook_contains_all_names(phonebook):
    phonebook.add("Bob", "1234")
    # assert phonebook.names() == {"Bob", "Misssing"}
    assert "Bob" in phonebook.names()

@pytest.mark.slow
def test_missing_name_raises_error(phonebook):
    # phonebook.add("Bob", "1234")
    with pytest.raises(KeyError):
        phonebook.lookup("Bob")