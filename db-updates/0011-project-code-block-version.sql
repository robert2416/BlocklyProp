/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Author:  J. Ewald
 * Created: May 21, 2018
 *
 * Add an field to record the version of the block library that the was last
 * used to validate the project code block.This will allow the app to bypass
 * the block scanning routines each time a project is loaded, once it has been
 * scanned against the current block version.
 */

ALTER TABLE blocklyprop.project ADD code_block_version SMALLINT DEFAULT 0 NOT NULL AFTER code;

-- Record schema change
INSERT INTO blocklyprop.admin (
    db_version, 
    db_script,
    notes
    )
VALUES (
    11,
    '0011-project-code-block-version',
    'Add field to support project code block versioning'
    );
