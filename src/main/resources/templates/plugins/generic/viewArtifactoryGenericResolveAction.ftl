[#import "/lib/build.ftl" as bd]
<div id="artifactoryConfigDiv" style='display: none'>
[@ww.label labelKey='Artifactory Server URL' name='builder.artifactoryGenericBuilder.artifactoryServerId' /]
[@ww.label labelKey='Publishing Repository' name='builder.artifactoryGenericBuilder.deployableRepo' hideOnNull='true' /]
[@ww.label labelKey='Deployer Username' name='artifactory.generic.username' hideOnNull='true' /]
[@ww.label labelKey='Resolve Pattern' name='artifactory.generic.resolvePattern' hideOnNull='true' /]
[@ww.label labelKey='Spec Job Configuration' name='artifactory.generic.jobConfiguration' hideOnNull='true' /]
[@ww.label labelKey='Spec File' name='artifactory.generic.file' hideOnNull='true' /]
</div>
