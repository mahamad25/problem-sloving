import java.util.*;

class ThroneInheritance {

    class Person {
        String name;
        boolean alive;
        List<Person> children;

        Person(String name) {
            this.name = name;
            alive = true;
            children = new ArrayList<>();
        }
    }

    Person king;
    Map<String, Person> people;

    public ThroneInheritance(String kingName) {
        people = new HashMap<>();
        king = new Person(kingName);
        people.put(kingName, king);
    }

    public void birth(String parentName, String childName) {
        Person parent = people.get(parentName);
        Person child = new Person(childName);

        parent.children.add(child);
        people.put(childName, child);
    }

    public void death(String name) {
        people.get(name).alive = false;
    }

    public List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();
        dfs(king, result);
        return result;
    }

    private void dfs(Person person, List<String> result) {
        if (person.alive) {
            result.add(person.name);
        }

        for (Person child : person.children) {
            dfs(child, result);
        }
    }
}
output
  [null, null, null, null, null, null, null, 
["king", "andy", "matthew", "bob", "alex", "asha", "catherine"], 
null, 
["king", "andy", "matthew", "alex", "asha", "catherine"]]
