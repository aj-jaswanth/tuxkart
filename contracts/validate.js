'use strict';

const yaml = require('js-yaml');
const fs = require('fs');

try {
    yaml.safeLoad(fs.readFileSync('swagger.yml', 'utf8'));
} catch (e) {
    console.log('Failed to parse YML :', e);
    process.exit(1);
}
