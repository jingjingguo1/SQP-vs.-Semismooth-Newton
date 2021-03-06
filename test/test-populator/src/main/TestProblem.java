package main;

/**
 * TestProblem represents test problem in the form:
 * 
 *    min  f(x)
 *     x
 *   s.t.  A*x = b
 *         G*x <= r
 *       u <= x <= v
 * 
 * This problem will be written at the end in a Matlab file.
 * That's why most of the properties in this class are from the type String
 * and will be written using Matlab syntax.
 * @author Vicky H. Tanzil
 */
public class TestProblem {
	
	/**
	 * The name of the problem.
	 */
	private String name;

	/**
	 * The objective function.
	 */
	private TestFunction f;
	
	/**
	 * The description of the problem.
	 * Especially, from where the problem was taken.
	 */
	private String description;
	
	/**
	 * The classification of the problem.
	 */
	private String classification;
	
	/**
	 * The matrix defining the left hand side of the equality constraints.
	 */
	private String A;
	
	/**
	 * The vector defining the right hand side of the equality constraints.
	 */
	private String b;
	
	/**
	 * The matrix defining the left hand side of the inequality constraints.
	 */
	private String G;

	/**
	 * The vector defining the right hand side of the inequality constraints.
	 */
	private String r;

	/**
	 * The vector defining the lower bound.
	 */
	private String u;

	/**
	 * The vector defining the upper bound.
	 */
	private String v;

	/**
	 * The point as the starting point for the algorithms.
	 * This should be a feasible point.
	 */
	private String x0;
	
	/**
	 * The point known as the solution of the problem.
	 */
	private String xstar;

	/**
	 * The tolerance for the stop criteria in the algorithms
	 */
	private String tolerance;

	/**
	 * The maximum number of iterations the algorithms can have.
	 */
	private String maxIteration;
	
	private double ssnSolveTime;
	private double sqpSolveTime;
	private int ssnSolveIterationNumber;
	private int sqpSolveIterationNumber;

	/**
	 * Create an initial test problem.
	 * @param testProblemName The name of the problem.
	 * @param testFunction The objective function.
	 */
	public TestProblem(String testProblemName, TestFunction testFunction) {
		this.name = testProblemName;
		f = testFunction.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TestFunction getTestFunction() {
		return f;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String get_A() {
		return A;
	}

	public void set_A(String A) {
		if (A == null) {
			A = "[]";
		}
		this.A = A;
	}

	public String get_b() {
		return b;
	}

	public void set_b(String b) {
		if (b == null) {
			b = "[]";
		}
		this.b = b;
	}

	public String get_G() {
		return G;
	}

	public void set_G(String G) {
		if (G == null) {
			G = "[]";
		}
		this.G = G;
	}

	public String get_r() {
		return r;
	}

	public void set_r(String r) {
		if (r == null) {
			r = "[]";
		}
		this.r = r;
	}

	public String get_u() {
		return u;
	}

	public void set_u(String u) {
		if (u == null) {
			u = "[]";
		}
		this.u = u;
	}

	public String get_v() {
		return v;
	}

	public void set_v(String v) {
		if (v == null) {
			v = "[]";
		}
		this.v = v;
	}

	public String get_x0() {
		return x0;
	}

	public void set_x0(String x0) {
		this.x0 = x0;
	}

	public String get_xstar() {
		return xstar;
	}

	public void set_xstar(String xstar) {
		this.xstar = xstar;
	}

	public String getTolerance() {
		return tolerance;
	}

	public void setTolerance(String tolerance) {
		if (tolerance == null) {
			tolerance = f.getEps();
		}
		this.tolerance = tolerance;
	}

	public String getMaxIteration() {
		return maxIteration;
	}

	public void setMaxIteration(String maxIteration) {
		if (maxIteration == null) {
			maxIteration = "100";
		}
		this.maxIteration = maxIteration;
	}
	
	public int getDimension() {
		if (x0 != null) {
			String[] s = x0.split(";");
			return s.length;
		} else {
			System.err.println("Unable to compute dimension, since x0 undefined");
			return 0;
		}
	}
	
	public double getSsnSolveTime() {
		return ssnSolveTime;
	}

	public void setSsnSolveTime(double ssnSolveTime) {
		this.ssnSolveTime = ssnSolveTime;
	}

	public double getSqpSolveTime() {
		return sqpSolveTime;
	}

	public void setSqpSolveTime(double sqpSolveTime) {
		this.sqpSolveTime = sqpSolveTime;
	}

	public int getSsnSolveIterationNumber() {
		return ssnSolveIterationNumber;
	}

	public void setSsnSolveIterationNumber(int ssnSolveIterationNumber) {
		this.ssnSolveIterationNumber = ssnSolveIterationNumber;
	}

	public int getSqpSolveIterationNumber() {
		return sqpSolveIterationNumber;
	}

	public void setSqpSolveIterationNumber(int sqpSolveIterationNumber) {
		this.sqpSolveIterationNumber = sqpSolveIterationNumber;
	}
}