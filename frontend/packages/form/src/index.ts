export * from './Binder.js';
export * from './Field.js';
export * from './Models.js';
export * from './Validation.js';
export * from './Validators.js';

const $wnd = window as any;
$wnd.Vaadin = $wnd.Vaadin || {};
$wnd.Vaadin.registrations = $wnd.Vaadin.registrations || [];
$wnd.Vaadin.registrations.push({
  is: '@vaadin/form',
  version: /* updated-by-script */ '0.0.9',
});
