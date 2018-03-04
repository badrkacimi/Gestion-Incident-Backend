angular.module("app",['ngRoute','studentController'])

.config(function($routeProvider,$locationProvider) { 

	$routeProvider

	.when('/home',{
		templateUrl: 'app/views/pages/home.html'
	})
	.when('/register',{
		templateUrl: 'app/views/pages/register.html',
		controller : 'registerCtrl',
		controllerAs : 'register'
	})
	.when('/about',{
		templateUrl: 'app/views/pages/about.html'
	})
	.otherwise({
		redirectTo: '/'
	});

	$locationProvider.html5Mode({
		enabled:true,
		requireBase:false
	});
});
