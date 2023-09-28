package _07ReflectionAndAnnotations._02Exercise._01HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        Class<RichSoilLand> clazz = RichSoilLand.class;
        Field[] fields = clazz.getDeclaredFields();

        String cmd;
        while (!"HARVEST".equals(cmd = scanner.nextLine())) {
            for (Field field : fields) {
                int modifier = field.getModifiers();

				Optional<String> fieldInfo = Optional.empty();

                if (cmd.equals("private") && Modifier.isPrivate(modifier)) {
					fieldInfo = Optional.of(getFieldInfo(field, modifier));
				} else if (cmd.equals("protected") && Modifier.isProtected(modifier)) {
					fieldInfo = Optional.of(getFieldInfo(field, modifier));
				} else if (cmd.equals("public") && Modifier.isPublic(modifier)) {
					fieldInfo = Optional.of(getFieldInfo(field, modifier));
				} else if(cmd.equals("all")) {
					fieldInfo = Optional.of(getFieldInfo(field, modifier));
				}

				fieldInfo.ifPresent(System.out::println);
			}
        }
    }

	private static String getFieldInfo(Field field, int modifier) {
		return String.format("%s %s %s", Modifier.toString(modifier), field.getType().getSimpleName(), field.getName());
	}

}
