package br.com.caelum.ingresso.model.form;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import br.com.caelum.ingresso.model.Lugar;
import br.com.caelum.ingresso.model.Sala;

public class SalaForm {
    private Integer salaId;

    @NotBlank
    private String nome;

    private List<Lugar> lugares = new ArrayList<>();
    
    @NotNull
    private BigDecimal preco;

    public SalaForm() {
    }

    public SalaForm(Sala sala) {
        this.salaId = sala.getId();
        this.nome = sala.getNome();
        this.lugares = new ArrayList<>(sala.getLugares());
        this.preco = sala.getPreco();
    }

    public Integer getSalaId() {
        return salaId;
    }

    public void setSalaId(Integer salaId) {
        this.salaId = salaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    public Sala toSala() {
        Sala sala = new Sala(this.nome, this.preco);
        sala.setId(this.salaId);
        sala.setLugares(new HashSet<>(this.lugares));
        return sala;
    }

	public BigDecimal abs() {
		return preco.abs();
	}

	public BigDecimal abs(MathContext arg0) {
		return preco.abs(arg0);
	}

	public BigDecimal add(BigDecimal arg0) {
		return preco.add(arg0);
	}

	public BigDecimal add(BigDecimal arg0, MathContext arg1) {
		return preco.add(arg0, arg1);
	}

	public byte byteValue() {
		return preco.byteValue();
	}

	public byte byteValueExact() {
		return preco.byteValueExact();
	}

	public int compareTo(BigDecimal arg0) {
		return preco.compareTo(arg0);
	}

	public BigDecimal divide(BigDecimal arg0) {
		return preco.divide(arg0);
	}

	public BigDecimal divide(BigDecimal arg0, int arg1) {
		return preco.divide(arg0, arg1);
	}

	public BigDecimal divide(BigDecimal arg0, RoundingMode arg1) {
		return preco.divide(arg0, arg1);
	}

	public BigDecimal divide(BigDecimal arg0, MathContext arg1) {
		return preco.divide(arg0, arg1);
	}

	public BigDecimal divide(BigDecimal arg0, int arg1, int arg2) {
		return preco.divide(arg0, arg1, arg2);
	}

	public BigDecimal divide(BigDecimal arg0, int arg1, RoundingMode arg2) {
		return preco.divide(arg0, arg1, arg2);
	}

	public BigDecimal[] divideAndRemainder(BigDecimal arg0) {
		return preco.divideAndRemainder(arg0);
	}

	public BigDecimal[] divideAndRemainder(BigDecimal arg0, MathContext arg1) {
		return preco.divideAndRemainder(arg0, arg1);
	}

	public BigDecimal divideToIntegralValue(BigDecimal arg0) {
		return preco.divideToIntegralValue(arg0);
	}

	public BigDecimal divideToIntegralValue(BigDecimal arg0, MathContext arg1) {
		return preco.divideToIntegralValue(arg0, arg1);
	}

	public double doubleValue() {
		return preco.doubleValue();
	}

	public boolean equals(Object arg0) {
		return preco.equals(arg0);
	}

	public float floatValue() {
		return preco.floatValue();
	}

	public int hashCode() {
		return preco.hashCode();
	}

	public int intValue() {
		return preco.intValue();
	}

	public int intValueExact() {
		return preco.intValueExact();
	}

	public long longValue() {
		return preco.longValue();
	}

	public long longValueExact() {
		return preco.longValueExact();
	}

	public BigDecimal max(BigDecimal arg0) {
		return preco.max(arg0);
	}

	public BigDecimal min(BigDecimal arg0) {
		return preco.min(arg0);
	}

	public BigDecimal movePointLeft(int arg0) {
		return preco.movePointLeft(arg0);
	}

	public BigDecimal movePointRight(int arg0) {
		return preco.movePointRight(arg0);
	}

	public BigDecimal multiply(BigDecimal arg0) {
		return preco.multiply(arg0);
	}

	public BigDecimal multiply(BigDecimal arg0, MathContext arg1) {
		return preco.multiply(arg0, arg1);
	}

	public BigDecimal negate() {
		return preco.negate();
	}

	public BigDecimal negate(MathContext arg0) {
		return preco.negate(arg0);
	}

	public BigDecimal plus() {
		return preco.plus();
	}

	public BigDecimal plus(MathContext arg0) {
		return preco.plus(arg0);
	}

	public BigDecimal pow(int arg0) {
		return preco.pow(arg0);
	}

	public BigDecimal pow(int arg0, MathContext arg1) {
		return preco.pow(arg0, arg1);
	}

	public int precision() {
		return preco.precision();
	}

	public BigDecimal remainder(BigDecimal arg0) {
		return preco.remainder(arg0);
	}

	public BigDecimal remainder(BigDecimal arg0, MathContext arg1) {
		return preco.remainder(arg0, arg1);
	}

	public BigDecimal round(MathContext arg0) {
		return preco.round(arg0);
	}

	public int scale() {
		return preco.scale();
	}

	public BigDecimal scaleByPowerOfTen(int arg0) {
		return preco.scaleByPowerOfTen(arg0);
	}

	public BigDecimal setScale(int arg0) {
		return preco.setScale(arg0);
	}

	public BigDecimal setScale(int arg0, RoundingMode arg1) {
		return preco.setScale(arg0, arg1);
	}

	public BigDecimal setScale(int arg0, int arg1) {
		return preco.setScale(arg0, arg1);
	}

	public short shortValue() {
		return preco.shortValue();
	}

	public short shortValueExact() {
		return preco.shortValueExact();
	}

	public int signum() {
		return preco.signum();
	}

	public BigDecimal stripTrailingZeros() {
		return preco.stripTrailingZeros();
	}

	public BigDecimal subtract(BigDecimal arg0) {
		return preco.subtract(arg0);
	}

	public BigDecimal subtract(BigDecimal arg0, MathContext arg1) {
		return preco.subtract(arg0, arg1);
	}

	public BigInteger toBigInteger() {
		return preco.toBigInteger();
	}

	public BigInteger toBigIntegerExact() {
		return preco.toBigIntegerExact();
	}

	public String toEngineeringString() {
		return preco.toEngineeringString();
	}

	public String toPlainString() {
		return preco.toPlainString();
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String toString() {
		return preco.toString();
	}

	public BigDecimal ulp() {
		return preco.ulp();
	}

	public BigInteger unscaledValue() {
		return preco.unscaledValue();
	}

}
