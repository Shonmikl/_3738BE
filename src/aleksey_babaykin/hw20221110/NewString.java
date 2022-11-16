package aleksey_babaykin.hw20221110;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class NewString {
        private String value = null;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NewString newString = (NewString) o;

            return value != null ? value.equalsIgnoreCase(newString.getValue())
                    : newString.value == null;
        }

        @Override
        public int hashCode() {
            return value != null ? value.toUpperCase().hashCode() : 0;
        }

        @Override
        public String toString() {
            return value;
        }
}