function g = grad_quad_func_3_v0(x)
	lambda = 1;
	g = grad_quad_func_3(x) + lambda*x;
end