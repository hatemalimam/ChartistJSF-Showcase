(function(Showcase, $, undefined) {

	Showcase.init = function() {

	};

	Showcase.submitForm = function() {
		submitForm([ {
			name : 'optionsData',
			value : JSON.stringify($('#optionsForm').serializeObject())
		} ])
	}

	Showcase.optionsFormEvents = function() {
		$("#optionsForm").change(function() {
			Showcase.submitForm();
		})
	}

}(window.Showcase = window.Showcase || {}, jQuery));

$.fn.serializeObject = function() {
	var o = {};
	var a = this.serializeArray();
	$.each(a, function() {
		if (o[this.name] !== undefined) {
			if (!o[this.name].push) {
				o[this.name] = [ o[this.name] ];
			}
			o[this.name].push(this.value || '');
		} else {
			o[this.name] = this.value || '';
		}
	});
	return o;
};

$(function() {
	Showcase.init();
});
