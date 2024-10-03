import java.util.List;
import java.util.function.Predicate;

public class FiltroGenerico {
	
	public static List<Veiculo> filtrarGenericamente(List<Veiculo> v, Predicate<Veiculo> p){
		return v.stream().filter(p).toList();	
	}
	
	public static List<Veiculo> filtrarVarias(List<Veiculo> v1, List<Veiculo> v2, List<Veiculo> v3){
		v1.addAll(v2);
		v1.addAll(v3);
		return v1.stream().filter((v)->v.getPreco() < 100.0).toList();
	}

}
