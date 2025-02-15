// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.secrets;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.models.KeyVaultSecret;
import com.azure.security.keyvault.secrets.models.SecretProperties;
import reactor.util.context.Context;

import java.time.OffsetDateTime;

/**
 * This class contains code samples for generating javadocs through doclets for {@link SecretAsyncClient}.
 */
public final class SecretAsyncClientJavaDocCodeSnippets {
    private final String key1 = "key1";
    private final String key2 = "key2";
    private final String value1 = "val1";
    private final String value2 = "val2";

    /**
     * Generates code sample for creating a {@link SecretAsyncClient}.
     *
     * @return An instance of {@link SecretAsyncClient}.
     */
    public SecretAsyncClient createAsyncClientWithHttpclient() {
        // BEGIN: com.azure.security.keyvault.secrets.SecretAsyncClient.instantiation.withHttpClient
        SecretAsyncClient secretAsyncClient = new SecretClientBuilder()
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .vaultUrl("<your-key-vault-url>")
            .credential(new DefaultAzureCredentialBuilder().build())
            .httpClient(HttpClient.createDefault())
            .buildAsyncClient();
        // END: com.azure.security.keyvault.secrets.SecretAsyncClient.instantiation.withHttpClient
        return secretAsyncClient;
    }

    /**
     * Generates code sample for creating a {@link SecretAsyncClient}.
     *
     * @return An instance of {@link SecretAsyncClient}.
     */
    private SecretAsyncClient getAsyncSecretClient() {
        // BEGIN: com.azure.security.keyvault.secrets.SecretAsyncClient.instantiation
        SecretAsyncClient secretAsyncClient = new SecretClientBuilder()
            .credential(new DefaultAzureCredentialBuilder().build())
            .vaultUrl("<your-key-vault-url>")
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .buildAsyncClient();
        // END: com.azure.security.keyvault.secrets.SecretAsyncClient.instantiation
        return secretAsyncClient;
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#getSecret(String, String)}.
     */
    public void getSecretCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.getSecret#string-string
        String secretVersion = "6A385B124DEF4096AF1361A85B16C204";
        secretAsyncClient.getSecret("secretName", secretVersion)
            // Passing a Context is optional and useful if you want a set of data to flow through the request.
            // Otherwise, the line below can be removed.
            .contextWrite(Context.of(key1, value1, key2, value2))
            .subscribe(secretWithVersion ->
                System.out.printf("Secret is returned with name %s and value %s %n",
                    secretWithVersion.getName(), secretWithVersion.getValue()));
        // END: com.azure.keyvault.secrets.SecretClient.getSecret#string-string

        // BEGIN: com.azure.keyvault.secrets.SecretClient.getSecret#string
        secretAsyncClient.getSecret("secretName")
            .subscribe(secretWithVersion ->
                System.out.printf("Secret is returned with name %s and value %s %n",
                    secretWithVersion.getName(), secretWithVersion.getValue()));
        // END: com.azure.keyvault.secrets.SecretClient.getSecret#string
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#getSecretWithResponse(String, String)}.
     */
    public void getSecretWithResponseCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();

        // BEGIN: com.azure.keyvault.secrets.SecretClient.getSecretWithResponse#string-string
        String secretVersion = "6A385B124DEF4096AF1361A85B16C204";
        secretAsyncClient.getSecretWithResponse("secretName", secretVersion)
            // Passing a Context is optional and useful if you want a set of data to flow through the request.
            // Otherwise, the line below can be removed.
            .contextWrite(Context.of(key1, value1, key2, value2))
            .subscribe(secretWithVersion ->
                System.out.printf("Secret is returned with name %s and value %s %n",
                    secretWithVersion.getValue().getName(), secretWithVersion.getValue().getValue()));
        // END: com.azure.keyvault.secrets.SecretClient.getSecretWithResponse#string-string
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#setSecret(KeyVaultSecret)}.
     */
    public void setSecretCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.setSecret#secret
        SecretProperties properties = new SecretProperties()
            .setExpiresOn(OffsetDateTime.now().plusDays(60));
        KeyVaultSecret newSecret = new KeyVaultSecret("secretName", "secretValue")
            .setProperties(properties);

        secretAsyncClient.setSecret(newSecret)
            .subscribe(secretResponse ->
                System.out.printf("Secret is created with name %s and value %s %n",
                    secretResponse.getName(), secretResponse.getValue()));
        // END: com.azure.keyvault.secrets.SecretClient.setSecret#secret

        // BEGIN: com.azure.keyvault.secrets.SecretClient.setSecret#string-string
        secretAsyncClient.setSecret("secretName", "secretValue")
            .subscribe(secretResponse ->
                System.out.printf("Secret is created with name %s and value %s%n",
                    secretResponse.getName(), secretResponse.getValue()));
        // END: com.azure.keyvault.secrets.SecretClient.setSecret#string-string
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#setSecretWithResponse(KeyVaultSecret)}.
     */
    public void setSecretWithResponseCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.setSecretWithResponse#secret
        KeyVaultSecret newSecret = new KeyVaultSecret("secretName", "secretValue").
            setProperties(new SecretProperties().setExpiresOn(OffsetDateTime.now().plusDays(60)));
        secretAsyncClient.setSecretWithResponse(newSecret)
            .subscribe(secretResponse ->
                System.out.printf("Secret is created with name %s and value %s %n",
                    secretResponse.getValue().getName(), secretResponse.getValue().getValue()));
        // END: com.azure.keyvault.secrets.SecretClient.setSecretWithResponse#secret
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#updateSecretProperties(SecretProperties)}.
     */
    public void updateSecretCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.updateSecretProperties#secretProperties
        secretAsyncClient.getSecret("secretName")
            .subscribe(secretResponseValue -> {
                SecretProperties secretProperties = secretResponseValue.getProperties();
                //Update the not before time of the secret.
                secretProperties.setNotBefore(OffsetDateTime.now().plusDays(50));
                secretAsyncClient.updateSecretProperties(secretProperties)
                    .subscribe(secretResponse ->
                        System.out.printf("Secret's updated not before time %s %n",
                            secretResponse.getNotBefore().toString()));
            });
        // END: com.azure.keyvault.secrets.SecretClient.updateSecretProperties#secretProperties
    }

    /**
     * Method to insert code snippets for
     * {@link SecretAsyncClient#updateSecretPropertiesWithResponse(SecretProperties)}.
     */
    public void updateSecretWithResponseCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.updateSecretPropertiesWithResponse#secretProperties
        secretAsyncClient.getSecret("secretName")
            .subscribe(secretResponseValue -> {
                SecretProperties secretProperties = secretResponseValue.getProperties();
                //Update the not before time of the secret.
                secretProperties.setNotBefore(OffsetDateTime.now().plusDays(50));
                secretAsyncClient.updateSecretPropertiesWithResponse(secretProperties)
                    .subscribe(secretResponse ->
                        System.out.printf("Secret's updated not before time %s %n",
                            secretResponse.getValue().getNotBefore().toString()));
            });
        // END: com.azure.keyvault.secrets.SecretClient.updateSecretPropertiesWithResponse#secretProperties
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#beginDeleteSecret(String)}.
     */
    public void deleteSecretCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.deleteSecret#String
        secretAsyncClient.beginDeleteSecret("secretName")
            .subscribe(pollResponse -> {
                System.out.println("Delete Status: " + pollResponse.getStatus().toString());
                System.out.println("Deleted Secret Name: " + pollResponse.getValue().getName());
                System.out.println("Deleted Secret Value: " + pollResponse.getValue().getValue());
            });
        // END: com.azure.keyvault.secrets.SecretClient.deleteSecret#String
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#getDeletedSecret(String)}.
     */
    public void getDeletedSecretCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.getDeletedSecret#string
        secretAsyncClient.getDeletedSecret("secretName")
            .subscribe(deletedSecretResponse ->
                System.out.printf("Deleted Secret's Recovery Id %s %n", deletedSecretResponse.getRecoveryId()));
        // END: com.azure.keyvault.secrets.SecretClient.getDeletedSecret#string
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#getDeletedSecretWithResponse(String)}.
     */
    public void getDeletedSecretWithResponseCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.getDeletedSecretWithResponse#string
        secretAsyncClient.getDeletedSecretWithResponse("secretName")
            .subscribe(deletedSecretResponse ->
                System.out.printf("Deleted Secret's Recovery Id %s %n",
                    deletedSecretResponse.getValue().getRecoveryId()));
        // END: com.azure.keyvault.secrets.SecretClient.getDeletedSecretWithResponse#string
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#purgeDeletedSecret(String)}.
     */
    public void purgeDeletedSecretCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.purgeDeletedSecret#string
        secretAsyncClient.purgeDeletedSecret("deletedSecretName")
            .doOnSuccess(purgeResponse ->
                System.out.println("Successfully Purged deleted Secret"))
            .subscribe();
        // END: com.azure.keyvault.secrets.SecretClient.purgeDeletedSecret#string
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#purgeDeletedSecretWithResponse(String)}.
     */
    public void purgeDeletedSecretWithResponseCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.purgeDeletedSecretWithResponse#string
        secretAsyncClient.purgeDeletedSecretWithResponse("deletedSecretName")
            .subscribe(purgeResponse ->
                System.out.printf("Purge Status response %d %n", purgeResponse.getStatusCode()));
        // END: com.azure.keyvault.secrets.SecretClient.purgeDeletedSecretWithResponse#string
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#beginRecoverDeletedSecret(String)}.
     */
    public void recoverDeletedSecretCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.recoverDeletedSecret#String
        secretAsyncClient.beginRecoverDeletedSecret("deletedSecretName")
            .subscribe(pollResponse -> {
                System.out.println("Recovery Status: " + pollResponse.getStatus().toString());
                System.out.println("Recovered Secret Name: " + pollResponse.getValue().getName());
                System.out.println("Recovered Secret Value: " + pollResponse.getValue().getValue());
            });
        // END: com.azure.keyvault.secrets.SecretClient.recoverDeletedSecret#String
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#backupSecret(String)}.
     */
    public void backupSecretCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.backupSecret#string
        secretAsyncClient.backupSecret("secretName")
            .subscribe(secretBackupResponse ->
                System.out.printf("Secret's Backup Byte array's length %s%n", secretBackupResponse.length));
        // END: com.azure.keyvault.secrets.SecretClient.backupSecret#string
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#backupSecretWithResponse(String)}.
     */
    public void backupSecretWithResponseCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.backupSecretWithResponse#string
        secretAsyncClient.backupSecretWithResponse("secretName")
            .subscribe(secretBackupResponse ->
                System.out.printf("Secret's Backup Byte array's length %s%n", secretBackupResponse.getValue().length));
        // END: com.azure.keyvault.secrets.SecretClient.backupSecretWithResponse#string
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#restoreSecretBackup(byte[])}.
     */
    public void restoreSecretCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.restoreSecret#byte
        // Pass the secret backup byte array to the restore operation.
        byte[] secretBackupByteArray = {};
        secretAsyncClient.restoreSecretBackup(secretBackupByteArray)
            .subscribe(secretResponse -> System.out.printf("Restored Secret with name %s and value %s %n",
                secretResponse.getName(), secretResponse.getValue()));
        // END: com.azure.keyvault.secrets.SecretClient.restoreSecret#byte
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#restoreSecretBackupWithResponse(byte[])}.
     */
    public void restoreSecretWithResponseCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.restoreSecretWithResponse#byte
        // Pass the secret backup byte array to the restore operation.
        byte[] secretBackupByteArray = {};
        secretAsyncClient.restoreSecretBackupWithResponse(secretBackupByteArray)
            .subscribe(secretResponse -> System.out.printf("Restored Secret with name %s and value %s %n",
                secretResponse.getValue().getName(), secretResponse.getValue().getValue()));
        // END: com.azure.keyvault.secrets.SecretClient.restoreSecretWithResponse#byte
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#listPropertiesOfSecrets()}.
     */
    public void listSecretsCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.listSecrets
        secretAsyncClient.listPropertiesOfSecrets()
            .flatMap(secretProperties -> {
                String name = secretProperties.getName();
                String version = secretProperties.getVersion();

                System.out.printf("Getting secret name: '%s', version: %s%n", name, version);
                return secretAsyncClient.getSecret(name, version);
            })
            .subscribe(secretResponse -> System.out.printf("Received secret with name %s and type %s",
                secretResponse.getName(), secretResponse.getValue()));
        // END: com.azure.keyvault.secrets.SecretClient.listSecrets
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#listDeletedSecrets()}.
     */
    public void listDeletedSecretsCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.listDeletedSecrets
        secretAsyncClient.listDeletedSecrets()
            .subscribe(deletedSecretResponse -> System.out.printf("Deleted Secret's Recovery Id %s %n",
                deletedSecretResponse.getRecoveryId()));
        // END: com.azure.keyvault.secrets.SecretClient.listDeletedSecrets
    }

    /**
     * Method to insert code snippets for {@link SecretAsyncClient#listPropertiesOfSecretVersions(String)}.
     */
    public void listSecretVersionsCodeSnippets() {
        SecretAsyncClient secretAsyncClient = getAsyncSecretClient();
        // BEGIN: com.azure.keyvault.secrets.SecretClient.listSecretVersions#string
        secretAsyncClient.listPropertiesOfSecretVersions("secretName")
            .flatMap(secretProperties -> {
                System.out.println("Get secret value for version: " + secretProperties.getVersion());
                return secretAsyncClient.getSecret(secretProperties.getName(), secretProperties.getVersion());
            })
            .subscribe(secret -> System.out.printf("Received secret with name %s and type %s%n",
                secret.getName(), secret.getValue()));
        // END: com.azure.keyvault.secrets.SecretClient.listSecretVersions#string
    }
}
